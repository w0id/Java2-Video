package course2.lesson1.problike.impl;

import course2.lesson1.problike.PublicationService;
import course2.lesson1.problike.model.Publication;

public class CachedPublicationService implements PublicationService {

    private final Publication publication;

    public CachedPublicationService(Publication publication) {
        this.publication = publication;
    }

    @Override
    public Publication getHotPublication() {
        return publication;
    }
}
