package biz.osvit.databaseexample.utils;

public final class C {

	private C() {

	}

	public static final String APPLICATION_NAME = "Database Example";

	public final class DatabaseConstants {

		private DatabaseConstants() {

		}

		public static final String DATABASE_NAME = "database.db";
		public static final int DATABASE_VERSION = 1;

		public static final String TABLE_USER_NAME = "User";
		public static final String TABLE_USER_ID = "_id";
		public static final String TABLE_USER_FIRST_NAME = "first_name";
		public static final String TABLE_USER_LAST_NAME = "last_name";
		public static final String TABLE_USER_GENDER = "gender";
		public static final String TABLE_USER_PHONE_NUMBER = "phone_number";

	}

}
