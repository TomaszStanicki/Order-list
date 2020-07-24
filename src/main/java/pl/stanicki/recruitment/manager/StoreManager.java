package pl.stanicki.recruitment.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.stanicki.recruitment.dao.StoreRepository;
import pl.stanicki.recruitment.dao.entity.Store;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class StoreManager {

    private StoreRepository storeRepository;

    @Autowired
    public StoreManager(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Optional<Store> findById(Long id) {
        return storeRepository.findById(id);

    }
    public Iterable<Store> findAll() {
        return storeRepository.findAll();
    }

    public Store save(Store position) {
        return storeRepository.save(position);
    }

   public void deleteById(Long id){
        storeRepository.deleteById(id);
   }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Store(1L, "Baton", "Jan", "Kowalski", LocalDate.of(2020,12,2 )));
        save(new Store(2L," Woda", "Grzegorz", "Buda", LocalDate.of(2020, 4, 6)));
        save(new Store(3L, "Gumy", "Anna", "Hurkacz", LocalDate.of(2020,8,23 )));
        save(new Store(4L," Lody", "Natalia", "Majchrzak", LocalDate.of(2020, 5, 12)));
        save(new Store(5L, "Lalka", "Piotr", "Kawecki", LocalDate.of(2020,1,14 )));
        save(new Store(6L,"Donica", "Tomasz", "Majer", LocalDate.of(2020, 3, 15)));

    }

}