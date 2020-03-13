
public class FixUuid {

    public static void main(String[] args) {
        if (args.length != 1) {
            help();
            return;
        } else if (args.length == 1) {
            String input = args[0];

            if (input.length() == 32) {
                fixMalformedString(input);
            } else if(input.length() == 34 && input.startsWith("0x")) {
                fixBinUuid(input);
            }
            else{
                System.out.println("Cannot be fixed, too malformed");
            }
        }
    }

    private static void fixMalformedString(String input) {

        StringBuilder builder = new StringBuilder();

        int pos = 0;
        builder.append(input.substring(pos, pos += 8));
        builder.append("-");
        builder.append(input.substring(pos, pos += 4));
        builder.append("-");
        builder.append(input.substring(pos, pos += 4));
        builder.append("-");
        builder.append(input.substring(pos, pos += 4));
        builder.append("-");
        builder.append(input.substring(pos, pos += 12));

        System.out.println(builder.toString());
    }

    private static void fixBinUuid(String input) {
        StringBuilder builder = new StringBuilder();

        int pos = 2;
        builder.append(input.substring(pos, pos += 8));
        builder.append("-");
        builder.append(input.substring(pos, pos += 4));
        builder.append("-");
        builder.append(input.substring(pos, pos += 4));
        builder.append("-");
        builder.append(input.substring(pos, pos += 4));
        builder.append("-");
        builder.append(input.substring(pos, pos += 12));

        System.out.println(builder.toString());

    }

    private static void help() {
        System.out.println("Usage: fixuuid <string/bin>");
    }
}