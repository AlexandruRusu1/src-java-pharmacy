package operations;

import domain.Drug;
import repository.SystemRepository;

import java.util.List;

public class DrugService {

    private final SystemRepository<Drug> drugSystemRepository;

    public DrugService(SystemRepository<Drug> drugSystemRepository) {
        this.drugSystemRepository = drugSystemRepository;
    }

    public List<Drug> getAllDrugs() {
        return drugSystemRepository.findAll();
    }

    public void addDrug (int id, String name, String producer, double price, boolean prescription) {
        Drug drug = new Drug(id, name, producer, price, prescription);
        drugSystemRepository.save(drug);
    }

    public Drug findByID (int id) {

        for (Drug drug: getAllDrugs()) {
            if (drug.getId() == id)
                return drug;
        }
        return null;
    }

    public void removeDrug (int id) {

        Drug drugToRemove = findByID(id);
        if (drugToRemove == null)
            throw new RuntimeException("Drug doesn't exist!");
        getAllDrugs().remove(id);
    }

    public void updateDrug (int id, int newPrice) {

        for (Drug drug : getAllDrugs())
            if (drug.getId() == id)
                drug.setPrice(newPrice);
    }
}
