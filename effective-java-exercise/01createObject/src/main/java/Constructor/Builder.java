package Constructor;

/**
 * Created by Yo on 2017/4/21.
 */
public class Builder {
    private int a;
    private int b;
    private int c;

    private Builder(BuilderInner builderInner) {
        this.a = builderInner.a;
        this.b = builderInner.b;
        this.c = builderInner.c;
    }

    public static class BuilderInner {

        private int a;
        private int b = 1;
        private int c = 2;

        public BuilderInner(int a) {
            this.a = a;
        }

        public BuilderInner b(int val) {
            this.b = val;
            return this;
        }

        public BuilderInner c(int val) {
            this.c = val;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
    }
}

class test2 {
    public static void main(String [] args){
        Builder bu = new Builder.BuilderInner(13).b(21).c(43).build();
        Builder bu2 = new Builder.BuilderInner(13).build();
    }
}