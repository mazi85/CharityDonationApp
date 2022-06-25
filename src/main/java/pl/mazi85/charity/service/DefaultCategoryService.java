package pl.mazi85.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mazi85.charity.model.Category;
import pl.mazi85.charity.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultCategoryService implements CategoryService{

    private final CategoryRepository categoryRepository;


    @Override
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
}
