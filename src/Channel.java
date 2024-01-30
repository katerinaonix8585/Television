import java.util.ArrayList;
import java.util.Random;

public class Channel {
    private int numberChannel;
    private String nameChannel;
    private ArrayList<Program> programs;

    Random random = new Random();

    public Channel(int numberChannel, String nameChannel) {
        this.programs = new ArrayList<>();
        this.numberChannel = numberChannel;
        this.nameChannel = nameChannel;
    }

    public int getNumberChannel() {
        return numberChannel;
    }

    public void setNumberChannel(int numberChannel) {
        this.numberChannel = numberChannel;
    }

    public String getNameChannel() {
        return nameChannel;
    }

    public void setNameChannel(String nameChannel) {
        this.nameChannel = nameChannel;
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    public void addProgram(Program program) {
        programs.add(program);
    }
    public String on(){
        int program = random.nextInt(programs.size());
        return String.format("%s", programs.get(program).getName());
    }

}
