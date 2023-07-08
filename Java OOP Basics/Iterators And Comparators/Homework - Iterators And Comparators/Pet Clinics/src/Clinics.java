import java.util.Comparator;
import java.util.HashMap;

public class Clinics implements Comparator<Pets> {

    //  private String clinicName;
    //  private int clinicRooms;
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

   /* public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public int getClinicRooms() {
        return clinicRooms;
    }

    public void setClinicRooms(int clinicRooms) {
        this.clinicRooms = clinicRooms;
    }*/

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

        int i = 0;
      //  for ( Pets[] map : this.numberOfRooms.length) {

       // }

    }
}
