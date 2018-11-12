package model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Park {
    @NotNull
    private String name;
    private List<@NotNull @Valid Car> carList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
