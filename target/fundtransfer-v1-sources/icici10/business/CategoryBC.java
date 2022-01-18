package icici10.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import icici10.domain.Category;
import icici10.persistence.CategoryDAO;

@BusinessController
public class CategoryBC extends DelegateCrud<Category, Long, CategoryDAO> {

	private static final long serialVersionUID = 1L;

}
