public class Student {
    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;
    private String fodselsNummer;


    public Student(String fornavn, String etternavn, String studentId, String fodselsNummer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.studentId = studentId;
        this.fodselsNummer = fodselsNummer;
    }

    public Student() {
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;;
    }

    public int getAlder(){
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }


    public String getFodselsNummer(){
        return fodselsNummer;
    }


    public void printStudentInformation(){
        System.out.println(fornavn + " " + etternavn +
                            " ID:" + studentId);

    }
    //public String fornavn, etternavn, studentId;


}
