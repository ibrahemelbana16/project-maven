package mainmaven;

public class intern {
    private int id;
    private String name;
    private double GPA;
    private double adda ;
    private String cvUrl;
    private String university;
    private String desiredTrack ;
    private boolean isAccepted;

    public intern(int id, String name, double GPA, String cvUrl, String university, String desiredTrack, boolean isAccepted) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
        this.cvUrl = cvUrl;
        this.university = university;
        this.desiredTrack = desiredTrack;
        this.isAccepted = isAccepted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setCvUrl(String cvUrl) {
        this.cvUrl = cvUrl;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDesiredTrack(String desiredTrack) {
        this.desiredTrack = desiredTrack;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public String getCvUrl() {
        return cvUrl;
    }

    public String getUniversity() {
        return university;
    }

    public String getDesiredTrack() {
        return desiredTrack;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    @Override
    public String toString() {
        return "intern{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                ", cvUrl='" + cvUrl + '\'' +
                ", university='" + university + '\'' +
                ", desiredTrack='" + desiredTrack + '\'' +
                ", isAccepted=" + isAccepted +
                '}';
    }
}

