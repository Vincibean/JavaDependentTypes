package org.vincibean.dt;

import java.util.Objects;

public class Foo implements HasBuilder<Foo.FooBuilder> {

    private int num;

    private String name;

    private Foo() {
       // Nothing to do here
    }

    public int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return getNum() == bar.getId() &&
                Objects.equals(getName(), bar.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getName());
    }

    @Override
    public FooBuilder builder() {
        return new FooBuilder();
    }

    public static final class FooBuilder implements Builder<Foo> {

        private Foo foo;

        public FooBuilder() {
            foo = new Foo();
        }

        public FooBuilder setNum(int num) {
            foo.setNum(num);
            return this;
        }

        public FooBuilder setName(String name) {
            foo.setName(name);
            return this;
        }

        public Foo build() {
            return foo;
        }

    }

}
