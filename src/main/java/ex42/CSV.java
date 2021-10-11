package ex42;

import java.util.List;

public class CSV {
    protected String[][] table;

    protected static int LAST_SPACES = 10;
    protected static int FIRST_SPACES = 10;

    public CSV(List<String> records) {
        table = new String[records.size()][];
        for (int i = 0; i < table.length; i++) {
            String record = records.get(i);
            // Split each line (record) into cells based on where there is a comma
            table[i] = record.split(",");
        }
    }

    public String getTableReport() {
        StringBuilder res = new StringBuilder("""
                        Last      First     Salary
                        --------------------------
                        """
        );
        for (String[] record : this.table) {
            res.append(record[0]);
            // LAST_SPACES is the length of the last name cell, by subtracting the length of the string we can get the
            // number of spaces to pad with
            res.append(" ".repeat(Math.max(0, LAST_SPACES - record[0].length())));
            res.append(record[1]);
            res.append(" ".repeat(Math.max(0, FIRST_SPACES - record[1].length())));
            res.append(record[2]).append('\n');
        }
        return res.toString();
    }
}
