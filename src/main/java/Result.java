public enum Result {
    NEGATIVE,
    POSITIVE,
    BORDERLINE,
    UNCHECKED;

    private String str;

    public static Result resultFromString(String str){
        for (Result r : Result.values()) {
            if (r.str.equalsIgnoreCase(str)) {
                return r;
            }
        }
        return null;
    }
}
