package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "flower")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pk_FlowerId;
    @Column(name = "nameFlower", nullable = false, length = 50)
    private String nameFlower;
    @Column(name = "countryFlower", nullable = false, length = 50)
    private String countryFlower;
    public Flower(){}
    public Flower(String nameFlower, String countryFlower){
        this.nameFlower = nameFlower;
        this.countryFlower = countryFlower;
    }

    public long getPk_FlowerId() {
        return pk_FlowerId;
    }
    public String getNameFlower() {
        return nameFlower;
    }
        public String getCountryFlower() {
            return countryFlower;
        }

        public void setPk_FlowerId(long pk_FlowerId) {
            this.pk_FlowerId = pk_FlowerId;
        }
        public void setNameFlowerDTO(String nameFlowerDTO) {
            this.nameFlower = nameFlower;
        }
        public void setCountryFlower(String countryFlower) {
            this.countryFlower = countryFlower;
        }

        @Override
        public String toString() {
            return "FlowerDTO{" +
                    "Id =" + pk_FlowerId +
                    ", Name FlowerDTO ='" + nameFlower + '\'' +
                    ", Country FlowerDTO ='" + countryFlower+ '\'' +
                    '}';
        }
}
