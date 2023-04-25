public class Users {
    private String nome;
    private String email;
    private String Password;
    private String endereço;
    private String Area;
    private Boolean disp;
    private String sexo;
    private double honorario;
    private String celular;
    private String Linked;

    public Users(String nome, String email, String password, String endereço, String area, Boolean disp, String sexo, double honorario, String celular, String linked) {
        this.nome = nome;
        this.email = email;
        this.Password = password;
        this.endereço = endereço;
        this.Area = area;
        this.disp = disp;
        this.sexo = sexo;
        this.honorario = honorario;
        this.celular = celular;
        this.Linked = linked;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public Boolean getDisp() {
        return disp;
    }

    public void setDisp(Boolean disp) {
        this.disp = disp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getHonorario() {
        return honorario;
    }

    public void setHonorario(double honorario) {
        this.honorario = honorario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLinked() {
        return Linked;
    }

    public void setLinked(String linked) {
        Linked = linked;
    }

}


