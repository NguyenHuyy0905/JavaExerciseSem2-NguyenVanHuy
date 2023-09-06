class ArrayCalculator {
    public static int maxOfArray(int[] arr) {
        int flag = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(flag < arr[i]) {
                flag = arr[i];
            }
        }
        return flag;
    }
    public static double maxOfArray(double[] arr) {
        double flag = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(flag < arr[i]) {
                flag = arr[i];
            }
        }
        return flag;
    }
    public static int minOfArray(int[] arr) {
        int flag = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(flag > arr[i]) {
                flag = arr[i];
            }
        }
        return flag;
    }
    public static double minOfArray(double[] arr) {
        double flag = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(flag > arr[i]) {
                flag = arr[i];
            }
        }
        return flag;
    }

}