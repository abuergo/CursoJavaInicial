public class Pais {
    private String name;
    private int code;
    private String id;

    public Pais(String name, int code, String id) {
        this.name = name;
        this.code = code;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " " + code + " " + id;
    }

}
