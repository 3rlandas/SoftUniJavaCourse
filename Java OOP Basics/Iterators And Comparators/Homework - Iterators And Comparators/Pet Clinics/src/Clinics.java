import java.util.Comparator;

public class Clinics implements Comparator<Pets> {

    private Pets[] numberOfRooms;

    public Clinics(int countRooms) {
        count(countRooms);
    }


    private void count(int countRooms) {
        if (countRooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.numberOfRooms = new Pets[countRooms];

    }

    @Override
    public int compare(Pets o1, Pets o2) {
        return 0;
    }

    public boolean addPets(Pets pets) {

        int room = this.numberOfRooms.length / 2;

        int i = 0;

        while (i < this.numberOfRooms.length) {

            if (i % 2 == 0) {
                room += i;
            } else {
                room -= i;
            }
            if (this.numberOfRooms[room] == null) {
                this.numberOfRooms[room] = pets;
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean releasePet() {

        int room = this.numberOfRooms.length / 2;
        while (room < this.numberOfRooms.length) {

            if (this.numberOfRooms[room] != null) {
                this.numberOfRooms[room] = null;
                return true;
            }
            room++;

        }
        room = 0;
        while (room <= this.numberOfRooms.length / 2 - 1) {

            if (this.numberOfRooms[room] != null) {
                this.numberOfRooms[room] = null;
                return true;
            }
            room++;

        }
        return false;
    }

    public boolean hasEmptyRooms() {

        int i = 0;

        while (i < this.numberOfRooms.length) {
            if (this.numberOfRooms[i] == null) {
                return true;
            }
            i++;
        }
        return false;
    }

    public void printClinic() {

        for (Pets pet : this.numberOfRooms) {

            if (pet != null) {
                System.out.println(pet.toString());
            } else {
                System.out.println("Room empty");
            }
        }
    }

    public void printRoom(int room) {
        if (this.numberOfRooms[room -1] != null) {

            System.out.println(this.numberOfRooms[room -1].toString());

        } else {
            System.out.println("Room empty");
        }
    }
}
