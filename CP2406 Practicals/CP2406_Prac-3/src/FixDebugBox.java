public class FixDebugBox
{
    private int width;
    private int length;
    private int height;
    FixDebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }
    public FixDebugBox(int width, int length, int height)
    {
        width = width;
        length = length;
        height = height;
    }
    public void showData()
    {
        System.out.println("Width: "  + width + "  Length: " +
                length + "  Height: " + height);
    }
    public double getVolume()
    {
        double vol = length * width * height;
        return vol;
    }
}
