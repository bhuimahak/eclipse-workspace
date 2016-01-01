package generics.sorting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.apache.log4j.Logger;

public class Jukebox {

	Logger LOG = Logger.getLogger(Jukebox.class);

	List<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new Jukebox().go();
	}

	public void go() {
		getSongs();
		// System.out.println(songList);
		LOG.debug("printing song list" + songList);

		Collections.sort(songList);
		// System.out.println("sorted on the basis of title" + songList);
		LOG.info("sorted on the basis of title" + songList);
		Comparator<Song> artistCompare = new Comparator<Song>() {

			@Override
			public int compare(Song s1, Song s2) {

				return s1.getArtist().compareTo(s2.getArtist());
			}

		};
		Collections.sort(songList, artistCompare);
		// System.out.println("******");
		// System.out.println(songList);
		LOG.info("sorted on the basis of artist" + songList);

		// to print unique elements i.e. no duplicates
		// HashSet<Song> songSet = new HashSet<Song>();
		// songSet.addAll(songList);
		// System.out.println("printing songSet: " +songSet);

		// to print unique and sorted elements use TreeSet
		TreeSet<Song> tree = new TreeSet<Song>();
		tree.addAll(songList);
		// System.out.println("printing TreeSet****: " +tree);
		LOG.debug("printing TreeSet: " + tree);
	}

	public List<Song> getSongs() {
		BufferedReader reader = null;
		try {
			String line = null;
			FileReader fr = new FileReader("resources/song.txt");
			reader = new BufferedReader(fr);
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (FileNotFoundException e) {
			LOG.error("Songs file not found", e);
			e.printStackTrace();
		} catch (IOException e) {
			LOG.error("IO Exception  while reading song file.", e);
			e.printStackTrace();
		}

		finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

		return songList;
	}

	public void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song s = new Song(tokens[0], tokens[1], tokens[2]);
		songList.add(s);
	}
}
