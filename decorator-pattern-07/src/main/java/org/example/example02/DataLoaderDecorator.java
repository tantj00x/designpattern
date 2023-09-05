package org.example.example02;

/**
 * 抽象装饰着类
 */
public class DataLoaderDecorator implements DataLoader {

    /**
     * 持有DataLoader的引用
     */
    private DataLoader dataLoader;

    public DataLoaderDecorator(DataLoader dataLoader) {
        this.dataLoader = dataLoader;
    }

    @Override
    public String read() {
        return dataLoader.read();
    }

    @Override
    public void write(String data) {
        dataLoader.write(data);
    }
}
