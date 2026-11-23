class ProductOfNumbers {
List<Integer> prefix = new ArrayList<>(List.of(1));
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        
        if (num == 0) {
            prefix = new ArrayList<>(List.of(1));
        } else {
            prefix.add(prefix.get(prefix.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        
    int n = prefix.size();
        if (k >= n) return 0;
        return prefix.get(n - 1) / prefix.get(n - 1 - k);
    }

public static void main(String[] args){
    String[] commands = {
            "ProductOfNumbers", "add", "add", "add", "add", "add",
            "getProduct", "getProduct", "getProduct", "add", "getProduct"
        };

        int[][] inputArgs = {
            {}, {3}, {0}, {2}, {5}, {4},
            {2}, {3}, {4}, {8}, {2}
        };

        ProductOfNumbers obj = null;
        List<Object> output = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            String cmd = commands[i];
            int[] params = inputArgs[i];

            switch (cmd) {
                case "ProductOfNumbers":
                    obj = new ProductOfNumbers();
                    output.add(null);
                    break;

                case "add":
                    if (obj != null && params.length >= 1) {
                        obj.add(params[0]);
                        output.add(null);
                    }
                    break;

                case "getProduct":
                    if (obj != null && params.length >= 1) {
                        int prod = obj.getProduct(params[0]);
                        output.add(prod);
                    }
                    break;

                default:
                    throw new IllegalArgumentException("Unknown command: " + cmd);
            }
        }
System.out.println(output);
}

}



/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */