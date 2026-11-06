package class1;

public class DataTypes {
    public static void main(String[] args) {
        //Finish class
        System.out.println("Data Types");

        System.out.println("--------");
        System.out.println("Integer Data Type");

        int integerData = 3; // Primitive data type
        float floatData = 3.14f; // Primitive data type
        double doubleData = 888; // Primitive data type
        char charData = 64; // Primitive data type, only accept ASCII code
        boolean booleanData = true;
        System.out.println("Positive boolean data: " + booleanData);
        if (booleanData == true) {
            booleanData = false;
            System.out.println("Negative boolean data: " + booleanData);
        }
        System.out.println("Int PRIMITVE data type: " + integerData);
        System.out.println("float PRIMITIVE data type: " + floatData);
        System.out.println("double PRIMITIVE data type: " + doubleData);
        System.out.println("char PRIMITIVE ASCII data type: " + charData);

    }
}
