package rvt.Studenta_registr;

public class Student {
    private String vards;
    private String uzvards;
    private String epasts;
    private String personas_ID;
    private String reg_dat_laik;

public Student(String vards, String uzvards, String epasts, String personas_ID, String reg_dat_laik) {
    this.vards = vards;
    this.uzvards = uzvards;
    this.epasts = epasts;
    this.personas_ID = personas_ID;
    this.reg_dat_laik = reg_dat_laik;
}

public String getPersonasID() {
    return personas_ID;
}

public String converterCSV() {
    return String.join(",", vards, uzvards, epasts, personas_ID, reg_dat_laik);
}

public static Student fromCSV(String line) {
    String[] parts = line.split(",");

    return new Student(
        parts[0],
        parts[1],
        parts[2],
        parts[3],
        parts[4]
    );
}

public String formatRow() {
    return String.format(
        "%-12s %-12s %-25s %-15s %-20s",
        vards,
        uzvards,
        epasts,
        personas_ID,
        reg_dat_laik
    );
}

}
