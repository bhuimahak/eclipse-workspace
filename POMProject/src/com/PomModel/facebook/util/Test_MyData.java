package com.PomModel.facebook.util;

import com.PomModel.facebook.base.Page;

public class Test_MyData {

	public static void main(String[] args) {
		TestUtil.getData("LoginTest", Page.dataReader);
		TestUtil.getData("ChangePicTest", Page.dataReader);
		TestUtil.getData("FindaFriendTest", Page.dataReader);
		
	}

}

