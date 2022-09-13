package latecurio.webfluxeg;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository repository) {
        this.itemRepository = repository;
    }

    public Item create(String title) {
        Item item = new Item(title);
        return itemRepository.save(item);
    }

    public Optional<Item> get(Long id) {
        return itemRepository.findById(id);
    }

}
