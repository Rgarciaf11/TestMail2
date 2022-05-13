package types;

public class Person
{
    protected String DNI;
    protected String mail;

    public Person()
    {
        DNI="";
        mail="";
    }

    public Person(String DNI,String mail)
    {
        this.DNI=DNI;
        this.mail=mail;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {

        //validar DNI


        this.DNI = DNI;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {

        //validar MAIL


        this.mail = mail;
    }

    @Override
    public boolean equals(Object p)
    {
        return (this.DNI.equals(((Person)p).DNI));
    }

    @Override
    public String toString()
    {
        return DNI + " " + mail;
    }
}