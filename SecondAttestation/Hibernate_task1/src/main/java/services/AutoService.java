package services;

import dao.AutoDao;
import models.Auto;
import models.User;

import java.util.List;

public class AutoService {
    AutoDao autosDao = new AutoDao();

    public void saveAuto(Auto auto) {
        autosDao.save(auto);
    }

    public void updateAuto(Auto auto) {
        autosDao.update(auto);
    }

    public void deleteAuto(Auto auto) {
        autosDao.delete(auto);
    }

    public User findUserByAutoId(int auto_id) {
        return autosDao.findUserByAutoId(auto_id);
    }

    public Auto findAutoById(int auto_id) {
        return autosDao.findAutoById(auto_id);
    }

    public List<Auto> findAllAutos() {
        return autosDao.findAllAutos();
    }


}
