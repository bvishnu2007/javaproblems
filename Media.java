interface playable{
    public void playmedia();
}
interface downloadable{
    public void downloadmedia();
}
class musicplayer implements playable,downloadable
{
    public void playmedia()
    {
        System.out.println("play music....");
    }
    public void downloadmedia()
    {
        System.out.println("Download music....");
    }
}
class Main{
    public static void main(String[] args) {
        musicplayer m = new musicplayer();
        m.playmedia();
        m.downloadmedia();
    }
}