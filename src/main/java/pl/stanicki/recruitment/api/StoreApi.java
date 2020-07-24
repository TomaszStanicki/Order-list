package pl.stanicki.recruitment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.stanicki.recruitment.dao.entity.Store;
import pl.stanicki.recruitment.manager.StoreManager;
import java.util.Optional;

@RestController
@RequestMapping("api/store")
public class StoreApi {



    private StoreManager orderList;

    @Autowired
    public StoreApi(StoreManager orderList) {

        this.orderList = orderList;
    }

    @GetMapping("/all")
    public Iterable<Store> getAll() {
        return orderList.findAll();

    }

    @GetMapping
    public  Optional<Store> getById(@RequestParam Long index) {

        return orderList.findById(index);
    }

    @PostMapping
    public Store addPosition(@RequestBody Store position) {

        return orderList.save(position);
    }

    @PutMapping
    public Store updatePosition(@RequestBody Store position) {
        return orderList.save(position);
    }

    @DeleteMapping
    public void deletePosition(@RequestParam Long index) {
        orderList.deleteById(index);
    }

}
