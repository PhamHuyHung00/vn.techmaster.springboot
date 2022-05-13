package com.example.demo.repository;


import com.example.demo.model.Employer;
import com.example.demo.service.EmployerService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class EmployerRepository implements EmployerService {
    private static ConcurrentHashMap<Integer, Employer> employers;

    static {
        employers = new ConcurrentHashMap<>();
        employers.put(1, new Employer(1, "FPT", "FPT@gmail.vn", "HaNoi"));
        employers.put(2, new Employer(2, "VIETTEL", "VIETTEL@gmail.vn", "DaNang"));
        employers.put(3, new Employer(3, "ASP GROUP", "ASP GROUP@gmail.vn", "Saigon"));
        employers.put(4, new Employer(4, "HIVE TECH", "HIVE TECH@gmail.vn", "HCM"));
        employers.put(5, new Employer(5, "MISA", "MISA@gmail.vn", "HoiAn"));
        employers.put(6, new Employer(6, "SUN", "SUN@gmail.vn", "NgheAn"));
    }

    @Override
    public List<Employer> findAll() {
        return new ArrayList<>(employers.values());
    }

    @Override
    public void save(Employer employer) {
        employers.put(employer.getId(), employer);

    }

    @Override
    public Employer findById(int id) {
        return employers.get(id);
    }

    @Override
    public void update(int id, Employer employer) {
        employers.put(id, employer);
    }

    @Override
    public void remove(int id) {
        employers.remove(id);

    }
}
