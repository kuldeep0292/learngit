package test;

class Enum {
	public enum UserTypeEnum {
		APPMAN(0), OPERATOR(1);

        private String value;
        private int code;


        private UserTypeEnum(int code) {
            this.code = code;         
        }

    }

	public static void main(String args[]) {
		System.out.println(Enum.UserTypeEnum.values()[1]);
	}
}
