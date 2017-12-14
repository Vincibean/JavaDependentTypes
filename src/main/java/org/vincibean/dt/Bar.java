package org.vincibean.dt;

import java.util.Objects;

public final class Bar implements HasBuilder<Bar.BarBuilder> {

    private double id;

    private String username;

    private Bar() {
        // Nothing to do here...
    }

    public double getId() {
        return id;
    }

    private void setId(double id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return getId() == bar.getId() &&
                Objects.equals(getUsername(), bar.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername());
    }

    @Override
    public BarBuilder builder() {
        return new BarBuilder();
    }

    public static final class BarBuilder implements Builder<Bar> {

        private Bar bar;

        public BarBuilder() {
            bar = new Bar();
        }

        public BarBuilder setId(double id) {
            bar.setId(id);
            return this;
        }

        public BarBuilder setUsername(String username) {
            bar.setUsername(username);
            return this;
        }

        public Bar build() {
            return bar;
        }

    }

}
