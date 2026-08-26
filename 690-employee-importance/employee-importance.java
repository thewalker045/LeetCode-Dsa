class Solution {

    public int importance(int id, List<Employee> employees) {

        for (Employee emp : employees) {

            if (emp.id == id) {

                int total = emp.importance;

                int i = 0;

                while (i < emp.subordinates.size()) {

                    total += importance(
                            emp.subordinates.get(i),
                            employees);

                    i++;
                }

                return total;
            }
        }

        return 0;
    }

    public int getImportance(List<Employee> employees, int id) {

        return importance(id, employees);
    }
}