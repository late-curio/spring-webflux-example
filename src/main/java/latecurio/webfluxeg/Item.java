package latecurio.webfluxeg;

import javax.persistence.Id;

public class Item {

    @Id
    private Long id;

    private String title;

    public Item(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
