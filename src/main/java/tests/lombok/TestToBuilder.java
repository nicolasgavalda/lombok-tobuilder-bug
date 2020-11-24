package tests.lombok;

public class TestToBuilder {

    public static void main(String[] args) throws Exception {
        Bean bean = Bean.builder().id(1).name("test").build();
        System.out.println("Bean: " + bean);

        Bean modified = bean.toBuilder().description("custom description").build();
        System.out.println("Modified bean: " + modified);
    }
}
