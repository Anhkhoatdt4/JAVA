public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;
    
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
                + ", address=" + address + "]";
    }

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static Builder builder() {
       return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public Builder withFirstName(String firstname) {
            this.firstName = firstname;
            return this;
        }

        public Builder withLastName(String lastname) {
            this.lastName = lastname;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

   
}
