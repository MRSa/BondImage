package jp.sfjp.gokigen.bondimage.manipulate;

interface IManipulateImageOperation
{
    void selectEffectType(final IManipulateImageCallback callback);
    void selectedSaveImage();
    void sharedSaveImage();

    interface IManipulateImageCallback
    {
        void manipulateImageResult(int command, boolean isSuccess);
    }
}
