package JukeBoxComparableExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class JukeBox {
	ArrayList<Song> songList = new ArrayList<>();

	public static void main(String[] args) {
		new JukeBox().go();
	}

	class ArtistCompare implements Comparator<Song> {
		@Override
		public int compare(Song o1, Song o2) {
			return o1.artist.compareTo(o2.artist);
		}
	}

	public void go() {
		try {
			getSongs();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
//		HashSet<Song> songSet = new HashSet<>();
//		songSet.addAll(songList);
//		System.out.println(songSet);
		TreeSet<Song> treeSet = new TreeSet<>();
		treeSet.addAll(songList);
		System.out.println(treeSet);

//		Collections.sort(songList, new ArtistCompare());
//		System.out.println(songList);
//		Collections.sort(songList, new Comparator<Song>() {
//			public int compare(Song s, Song d) {
//				int value = 0;
//				if (s.rating > d.rating) {
//					value = 1;
//				} else if (s.rating < d.rating) {
//					value = -1;
//				}
//				return value;
//			};
//
//		});
//		System.out.println(songList);
	}

	private void getSongs() throws IOException {
		File f = new File("SongList.txt");
		try(BufferedReader reader = new BufferedReader(new FileReader(f))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void addSong(String line) {
		String[] tokens = line.split("/");
		Song s = new Song(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
		songList.add(s);
	}

}
