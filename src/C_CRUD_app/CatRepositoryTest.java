package C_CRUD_app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatRepositoryTest {
    CatRepository catRepository;

    @BeforeEach
    public void CatRepositoryNew(){
        catRepository = new CatRepository();
    }

    @Test
    public void findCatByIdTest(){
        assertEquals(1,catRepository.findById(1).getId());
    }

    @Test
    public void findCatByIdWhenCatNotFoundTest(){
        assertNull(catRepository.findById(9));
    }
}
