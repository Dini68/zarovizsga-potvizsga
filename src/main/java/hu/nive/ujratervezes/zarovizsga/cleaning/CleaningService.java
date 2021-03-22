package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CleaningService {

    private List<Cleanable> cleanables = new ArrayList<>();

    public List<Cleanable> getCleanables() {
        return cleanables;
    }
//    public void add(House house) {
//    }
//
//    public void add(Office office) {
//    }

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }
    public int cleanAll() {
        int sum = 0;
        for (Cleanable cleanable: cleanables) {
            sum += cleanable.clean();
        }
        cleanables.clear();
        return sum;

    }

    public int cleanOnlyOffices() {
        int sum = 0;
        List<Cleanable> remCleanables = new ArrayList<>();
        for (Cleanable cleanable: cleanables) {
            if (cleanable instanceof Office) {
                sum += cleanable.clean();
                remCleanables.add(cleanable);
            }
        }
        cleanables.removeAll(remCleanables);
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable cleanable: cleanables) {
            if (cleanable.getAddress().contains(address)) {
                result.add(cleanable);
            }
        }
        return result;
    }
    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        for (Cleanable cleanable: cleanables) {
            sb.append(cleanable.getAddress());
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }
}
