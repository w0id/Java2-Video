package course2.lesson1.problike.impl;

import course2.lesson1.problike.PublicationService;
import course2.lesson1.problike.model.Publication;

/**
 * Получение публикации из базы
 */
public class DbPublicationService implements PublicationService {


    @Override
    public Publication getHotPublication() {
        return new Publication();
    }
}
