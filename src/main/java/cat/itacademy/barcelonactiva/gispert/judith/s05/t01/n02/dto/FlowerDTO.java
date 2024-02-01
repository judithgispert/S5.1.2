package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerDTO {
    private int pk_FlowerDTOId;
    private String nameFlowerDTO;
    private String countryFlowerDTO;
    private String typeFlowerDTO;
    private final static List<String> countriesUE = new ArrayList<>(Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus",
            "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy",
            "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
            "Slovenia", "Spain", "Sweden"));

    public FlowerDTO(){}
    public FlowerDTO(String nameFlowerDTO, String countryFlowerDTO){
        this.nameFlowerDTO = nameFlowerDTO;
        this.countryFlowerDTO = countryFlowerDTO;
        this.typeFlowerDTO = searchType();
    }

    public int getPk_FlowerDTOId() {
        return pk_FlowerDTOId;
    }
    public String getNameFlowerDTO() {
        return nameFlowerDTO;
    }
    public String getCountryFlowerDTO() {
        return countryFlowerDTO;
    }
    public String getTypeFlowerDTO() {
        return typeFlowerDTO;
    }

    public void setPk_FlowerDTOId(int pk_FlowerDTOId) {
        this.pk_FlowerDTOId = pk_FlowerDTOId;
    }
    public void setNameFlowerDTO(String nameFlowerDTO) {
        this.nameFlowerDTO = nameFlowerDTO;
    }
    public void setCountryFlowerDTO(String countryFlowerDTO) {
        this.countryFlowerDTO = countryFlowerDTO;
    }
    public void setTypeFlowerDTO(String typeFlowerDTO) {
        this.typeFlowerDTO = typeFlowerDTO;
    }

    public String searchType(){
        boolean exist = countriesUE.contains(countryFlowerDTO);
        if (!exist){
            typeFlowerDTO = "Outside UE";
        } else {
            typeFlowerDTO = "UE";
        }
        return typeFlowerDTO;
    }

    @Override
    public String toString() {
        return "FlowerDTO{" +
                "Id =" + pk_FlowerDTOId +
                ", Name FlowerDTO ='" + nameFlowerDTO + '\'' +
                ", Country FlowerDTO ='" + countryFlowerDTO + '\'' +
                ", Type FlowerDTO ='" + typeFlowerDTO + '\'' +
                '}';
    }
}
