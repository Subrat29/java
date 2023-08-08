class DeleteVowels {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        String result = deleteVowels(input);
        System.out.println(result);
    }

    public static String deleteVowels(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}