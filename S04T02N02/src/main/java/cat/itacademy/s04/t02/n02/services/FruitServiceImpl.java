package cat.itacademy.s04.t02.n02.services;

import cat.itacademy.s04.t02.n02.exception.ResourceNotFoundException;
import cat.itacademy.s04.t02.n02.model.Fruit;
import cat.itacademy.s04.t02.n02.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        if (!fruitRepository.existsById(fruit.getId())) {
            throw new ResourceNotFoundException("Fruit with id " + fruit.getId() + " not found.");
        }
        return fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(int id) {
        if (!fruitRepository.existsById(id)) {
            throw new ResourceNotFoundException("Fruit with id " + id + " not found.");
        }
        fruitRepository.deleteById(id);
    }

    @Override
    public Fruit getFruitById(int id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fruit with id " + id + " not found."));
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
}