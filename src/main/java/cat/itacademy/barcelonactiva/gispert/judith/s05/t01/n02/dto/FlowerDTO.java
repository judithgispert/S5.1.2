package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.dto;

public class FlowerDTO {
    private long pk_FlowerDTOId;
    private String nameFlowerDTO;
    private String countryFlowerDTO;

    public FlowerDTO(){}
    public FlowerDTO(String nameFlowerDTO, String countryFlowerDTO){
        this.nameFlowerDTO = nameFlowerDTO;
        this.countryFlowerDTO = countryFlowerDTO;
    }

    public long getPk_FlowerDTOId() {
        return pk_FlowerDTOId;
    }
    public String getNameFlowerDTO() {
        return nameFlowerDTO;
    }
    public String getCountryFlowerDTO() {
        return countryFlowerDTO;
    }

    public void setPk_FlowerDTOId(long pk_FlowerDTOId) {
        this.pk_FlowerDTOId = pk_FlowerDTOId;
    }
    public void setNameFlowerDTO(String nameFlowerDTO) {
        this.nameFlowerDTO = nameFlowerDTO;
    }
    public void setCountryFlowerDTO(String countryFlowerDTO) {
        this.countryFlowerDTO = countryFlowerDTO;
    }

    @Override
    public String toString() {
        return "FlowerDTO{" +
                "Id =" + pk_FlowerDTOId +
                ", Name FlowerDTO ='" + nameFlowerDTO + '\'' +
                ", Country FlowerDTO ='" + countryFlowerDTO + '\'' +
                '}';
    }
}
