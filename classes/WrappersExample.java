package classes;

public class WrappersExample {
    public static void main(String[] args) {
        // convert primitives to objects
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(3.14);
        Boolean boolObj = Boolean.valueOf(true);
        
        // convert objects to primitives
        int intVal = intObj.intValue();
        double doubleVal = doubleObj.doubleValue();
        boolean boolVal = boolObj.booleanValue();

        // autoboxing (automatic conversion of primitives to wrapper objects):
        Integer autoBoxedInt = 50;
        Double autoBoxedDouble = 2.71;

        // unboxing (automatic conversion of objects to primitives):
        int unboxedInt = autoBoxedInt;
        double unboxedDouble = autoBoxedDouble;

        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Integer Value: " + intVal);
        System.out.println("Double Value: " + doubleVal);
        System.out.println("Boolean Value: " + boolVal);
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Autoboxed Double: " + autoBoxedDouble);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
    }
}
