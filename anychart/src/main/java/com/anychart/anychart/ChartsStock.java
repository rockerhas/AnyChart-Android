package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChartsStock extends Chart {

    public ChartsStock() {
        js.append("chart = anychart.stock();");
    }

    
    private Boolean animation;

    public void setAnimation(Boolean animation) {
        this.animation = animation;

        js.append(String.format(Locale.US, "chart.animation(%b);", animation));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b);", animation));
            js.setLength(0);
        }
    }

    private Boolean enabled;
    private Double duration;

    public void setAnimation(Boolean enabled, Double duration) {
        this.enabled = enabled;
        this.duration = duration;

        js.append(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));
            js.setLength(0);
        }
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        this.bottom = bottom;

        js.append(String.format(Locale.US, "chart.bottom(%f);", bottom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%f);", bottom));
            js.setLength(0);
        }
    }


    public void setBottom(String bottom1) {
        this.bottom1 = bottom1;

        js.append(String.format(Locale.US, "chart.bottom(%s);", bottom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%s);", bottom1));
            js.setLength(0);
        }
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = bounds;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
        this.bounds1 = bounds1;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(Bounds bounds2) {
        this.bounds2 = bounds2;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
            js.setLength(0);
        }
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        this.container = container;

        js.append(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(Stage container1) {
        this.container1 = container1;

        js.append(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(String container2) {
        this.container2 = container2;

        js.append(String.format(Locale.US, "chart.container(%s);", container2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", container2));
            js.setLength(0);
        }
    }


    public void setContainer(Element container3) {
        this.container3 = container3;

        js.append(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean contextMenu;

    public void setContextmenu(Boolean contextMenu) {
        this.contextMenu = contextMenu;

        js.append(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu));
            js.setLength(0);
        }
    }

    private Boolean async;

    public void setDraw(Boolean async) {
        this.async = async;

        js.append(String.format(Locale.US, "chart.draw(%b);", async));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.draw(%b);", async));
            js.setLength(0);
        }
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        this.key = key;

        js.append(String.format(Locale.US, "chart.getStat(%s);", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", key));
            js.setLength(0);
        }
    }


    public void setGetstat(Statistics key1) {
        this.key1 = key1;

        js.append(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double xCoord;
    private Double yCoord;

    public void setGlobaltolocal(Double xCoord, Double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        js.append(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));
            js.setLength(0);
        }
    }

    private Boolean grouping;
    private String[] grouping1;

    public void setGrouping(Boolean grouping) {
        this.grouping = grouping;

        js.append(String.format(Locale.US, "chart.grouping(%b);", grouping));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grouping(%b);", grouping));
            js.setLength(0);
        }
    }


    public void setGrouping(String[] grouping1) {
        this.grouping1 = grouping1;

        js.append(String.format(Locale.US, "chart.grouping(%s);", Arrays.toString(grouping1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grouping(%s);", Arrays.toString(grouping1)));
            js.setLength(0);
        }
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        this.height2 = height2;

        js.append(String.format(Locale.US, "chart.height(%f);", height2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%f);", height2));
            js.setLength(0);
        }
    }


    public void setHeight(String height3) {
        this.height3 = height3;

        js.append(String.format(Locale.US, "chart.height(%s);", height3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%s);", height3));
            js.setLength(0);
        }
    }

    private HoverMode interactivity;

    public void setInteractivity(HoverMode interactivity) {
        this.interactivity = interactivity;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", (interactivity != null) ? interactivity.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", (interactivity != null) ? interactivity.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String index;
    private Double index1;

    public void setLabel(String index) {
        this.index = index;

        js.append(String.format(Locale.US, "chart.label(%s);", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", index));
            js.setLength(0);
        }
    }


    public void setLabel(Double index1) {
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.label(%f);", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f);", index1));
            js.setLength(0);
        }
    }

    private Boolean label;
    private String label1;

    public void setLabel(Boolean label) {
        this.label = label;

        js.append(String.format(Locale.US, "chart.label(%b);", label));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%b);", label));
            js.setLength(0);
        }
    }

    private String index2;
    private Double index3;
    private Boolean label2;
    private String label3;

    public void setLabel(String index2, Boolean label2) {
        this.index2 = index2;
        this.label2 = label2;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index2, label2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index2, label2));
            js.setLength(0);
        }
    }


    public void setLabel(String index2, String label3) {
        this.index2 = index2;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index2, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index2, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index3, Boolean label2) {
        this.index3 = index3;
        this.label2 = label2;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index3, label2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index3, label2));
            js.setLength(0);
        }
    }


    public void setLabel(Double index3, String label3) {
        this.index3 = index3;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index3, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index3, label3));
            js.setLength(0);
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        this.left = left;

        js.append(String.format(Locale.US, "chart.left(%f);", left));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%f);", left));
            js.setLength(0);
        }
    }


    public void setLeft(String left1) {
        this.left1 = left1;

        js.append(String.format(Locale.US, "chart.left(%s);", left1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%s);", left1));
            js.setLength(0);
        }
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;

        js.append(String.format(Locale.US, "chart.listen(%s, %b);", type, useCapture));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listen(%s, %b);", type, useCapture));
            js.setLength(0);
        }
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type1 = type1;
        this.useCapture1 = useCapture1;

        js.append(String.format(Locale.US, "chart.listenOnce(%s, %b);", type1, useCapture1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listenOnce(%s, %b);", type1, useCapture1));
            js.setLength(0);
        }
    }

    private Double xCoord1;
    private Double yCoord1;

    public void setLocaltoglobal(Double xCoord1, Double yCoord1) {
        this.xCoord1 = xCoord1;
        this.yCoord1 = yCoord1;

        js.append(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));
            js.setLength(0);
        }
    }

    private Double[] margin;
    private String[] margin1;

    public void setMargin(Double[] margin) {
        this.margin = margin;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));
            js.setLength(0);
        }
    }


    public void setMargin(String[] margin1) {
        this.margin1 = margin1;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));
            js.setLength(0);
        }
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value6 = value6;
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
            js.setLength(0);
        }
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value7 = value7;
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
            js.setLength(0);
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        this.maxHeight = maxHeight;

        js.append(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));
            js.setLength(0);
        }
    }


    public void setMaxheight(String maxHeight1) {
        this.maxHeight1 = maxHeight1;

        js.append(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));
            js.setLength(0);
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        this.maxWidth = maxWidth;

        js.append(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));
            js.setLength(0);
        }
    }


    public void setMaxwidth(String maxWidth1) {
        this.maxWidth1 = maxWidth1;

        js.append(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));
            js.setLength(0);
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        this.minHeight = minHeight;

        js.append(String.format(Locale.US, "chart.minHeight(%f);", minHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%f);", minHeight));
            js.setLength(0);
        }
    }


    public void setMinheight(String minHeight1) {
        this.minHeight1 = minHeight1;

        js.append(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));
            js.setLength(0);
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        this.minWidth = minWidth;

        js.append(String.format(Locale.US, "chart.minWidth(%f);", minWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%f);", minWidth));
            js.setLength(0);
        }
    }


    public void setMinwidth(String minWidth1) {
        this.minWidth1 = minWidth1;

        js.append(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));
            js.setLength(0);
        }
    }

    private Double[] padding;
    private String[] padding1;

    public void setPadding(Double[] padding) {
        this.padding = padding;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));
            js.setLength(0);
        }
    }


    public void setPadding(String[] padding1) {
        this.padding1 = padding1;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));
            js.setLength(0);
        }
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value14, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value14 = value14;
        this.value8 = value8;
        this.value9 = value9;
        this.value10 = value10;
        this.value11 = value11;
        this.value12 = value12;
        this.value13 = value13;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));
            js.setLength(0);
        }
    }


    public void setPadding(Double value15, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value15 = value15;
        this.value8 = value8;
        this.value9 = value9;
        this.value10 = value10;
        this.value11 = value11;
        this.value12 = value12;
        this.value13 = value13;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));
            js.setLength(0);
        }
    }

    private Double index4;

    public void setPlot(Double index4) {
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.plot(%f);", index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.plot(%f);", index4));
            js.setLength(0);
        }
    }

    private Boolean plot;

    public void setPlot(Boolean plot) {
        this.plot = plot;

        js.append(String.format(Locale.US, "chart.plot(%b);", plot));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.plot(%b);", plot));
            js.setLength(0);
        }
    }

    private Double index5;
    private Boolean plot1;

    public void setPlot(Double index5, Boolean plot1) {
        this.index5 = index5;
        this.plot1 = plot1;

        js.append(String.format(Locale.US, "chart.plot(%f, %b);", index5, plot1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.plot(%f, %b);", index5, plot1));
            js.setLength(0);
        }
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
            js.setLength(0);
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type2 = type2;

        js.append(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));
            js.setLength(0);
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        this.right = right;

        js.append(String.format(Locale.US, "chart.right(%f);", right));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%f);", right));
            js.setLength(0);
        }
    }


    public void setRight(String right1) {
        this.right1 = right1;

        js.append(String.format(Locale.US, "chart.right(%s);", right1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%s);", right1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode;
    private ChartDataExportMode chartDataExportMode1;
    private String csvSettings;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings = csvSettings;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings = csvSettings;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings, filename));
            js.setLength(0);
        }
    }

    private Double width2;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;
    private String filename1;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width2 = width2;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));
            js.setLength(0);
        }
    }

    private Boolean includeTheme;
    private String filename2;

    public void setSaveasjson(Boolean includeTheme, String filename2) {
        this.includeTheme = includeTheme;
        this.filename2 = filename2;

        js.append(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));
            js.setLength(0);
        }
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private Boolean landscape1;
    private Double x2;
    private Double y2;
    private String filename3;

    public void setSaveaspdf(Double paperSizeOrWidthOrOptions, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x2, y2, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x2, y2, filename3));
            js.setLength(0);
        }
    }


    public void setSaveaspdf(String paperSizeOrWidthOrOptions1, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x2, y2, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x2, y2, filename3));
            js.setLength(0);
        }
    }

    private Double width3;
    private Double height5;
    private Double quality1;
    private String filename4;

    public void setSaveaspng(Double width3, Double height5, Double quality1, String filename4) {
        this.width3 = width3;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width3, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width3, height5, quality1, filename4));
            js.setLength(0);
        }
    }

    private String paperSize;
    private Boolean landscape2;
    private String filename5;

    public void setSaveassvg(String paperSize, Boolean landscape2, String filename5) {
        this.paperSize = paperSize;
        this.landscape2 = landscape2;
        this.filename5 = filename5;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));
            js.setLength(0);
        }
    }

    private Double width4;
    private Double height6;

    public void setSaveassvg(Double width4, Double height6) {
        this.width4 = width4;
        this.height6 = height6;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width4, height6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width4, height6));
            js.setLength(0);
        }
    }

    private String chartDataExportMode2;
    private ChartDataExportMode chartDataExportMode3;
    private String filename6;

    public void setSaveasxlsx(String chartDataExportMode2, String filename6) {
        this.chartDataExportMode2 = chartDataExportMode2;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));
            js.setLength(0);
        }
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename6) {
        this.chartDataExportMode3 = chartDataExportMode3;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));
            js.setLength(0);
        }
    }

    private Boolean includeTheme1;
    private String filename7;

    public void setSaveasxml(Boolean includeTheme1, String filename7) {
        this.includeTheme1 = includeTheme1;
        this.filename7 = filename7;

        js.append(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));
            js.setLength(0);
        }
    }

    private Boolean scroller;

    public void setScroller(Boolean scroller) {
        this.scroller = scroller;

        js.append(String.format(Locale.US, "chart.scroller(%b);", scroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.scroller(%b);", scroller));
            js.setLength(0);
        }
    }

    private Boolean scrollerGrouping;
    private String[] scrollerGrouping1;

    public void setScrollergrouping(Boolean scrollerGrouping) {
        this.scrollerGrouping = scrollerGrouping;

        js.append(String.format(Locale.US, "chart.scrollerGrouping(%b);", scrollerGrouping));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.scrollerGrouping(%b);", scrollerGrouping));
            js.setLength(0);
        }
    }


    public void setScrollergrouping(String[] scrollerGrouping1) {
        this.scrollerGrouping1 = scrollerGrouping1;

        js.append(String.format(Locale.US, "chart.scrollerGrouping(%s);", Arrays.toString(scrollerGrouping1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.scrollerGrouping(%s);", Arrays.toString(scrollerGrouping1)));
            js.setLength(0);
        }
    }

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        this.selectMarqueeFill = selectMarqueeFill;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color;
    private Double opacity;

    public void setSelectmarqueefill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));
            js.setLength(0);
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private Double opacity1;

    public void setSelectmarqueefill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double typeOrUnitOrStart;
    private String typeOrUnitOrStart1;
    private StockRangeType typeOrUnitOrStart2;
    private Interval typeOrUnitOrStart3;
    private Double endOrCountOrDispatchEvent;
    private String endOrCountOrDispatchEvent1;
    private Boolean endOrCountOrDispatchEvent2;
    private StockRangeAnchor anchorOrDispatchEvent;
    private Boolean anchorOrDispatchEvent1;
    private Boolean dispatchEvent;

    public void setSelectrange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%f, %f, %s, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%f, %f, %s, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%f, %f, %b, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%f, %f, %b, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%f, %s, %s, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%f, %s, %s, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%f, %s, %b, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%f, %s, %b, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%f, %b, %s, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%f, %b, %s, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%f, %b, %b, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%f, %b, %b, %b);", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %f, %s, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %f, %s, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %f, %b, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %f, %b, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %s, %s, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %s, %s, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %s, %b, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %s, %b, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %b, %s, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %b, %s, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %b, %b, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %b, %b, %b);", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %f, %s, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %f, %s, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %f, %b, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %f, %b, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %s, %s, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %s, %s, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %s, %b, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %s, %b, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %b, %s, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %b, %s, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %b, %b, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %b, %b, %b);", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Interval typeOrUnitOrStart3, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %f, %s, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %f, %s, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Interval typeOrUnitOrStart3, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %f, %b, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %f, %b, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Interval typeOrUnitOrStart3, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %s, %s, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %s, %s, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Interval typeOrUnitOrStart3, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %s, %b, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %s, %b, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Interval typeOrUnitOrStart3, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %b, %s, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %b, %s, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
    }


    public void setSelectrange(Interval typeOrUnitOrStart3, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;

        js.append(String.format(Locale.US, "chart.selectRange(%s, %b, %b, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectRange(%s, %b, %b, %b);", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
    }

    private Boolean repeat;

    public void setStartselectmarquee(Boolean repeat) {
        this.repeat = repeat;

        js.append(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));
            js.setLength(0);
        }
    }

    private Boolean repeat1;
    private Boolean asRect;

    public void setStartzoommarquee(Boolean repeat1, Boolean asRect) {
        this.repeat1 = repeat1;
        this.asRect = asRect;

        js.append(String.format(Locale.US, "chart.startZoomMarquee(%b, %b);", repeat1, asRect));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startZoomMarquee(%b, %b);", repeat1, asRect));
            js.setLength(0);
        }
    }

    private Boolean title;
    private String title1;

    public void setTitle(Boolean title) {
        this.title = title;

        js.append(String.format(Locale.US, "chart.title(%b);", title));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%b);", title));
            js.setLength(0);
        }
    }


    public void setTitle(String title1) {
        this.title1 = title1;

        js.append(String.format(Locale.US, "chart.title(%s);", title1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%s);", title1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode4;
    private ChartDataExportMode chartDataExportMode5;
    private String csvSettings1;

    public void setTocsv(String chartDataExportMode4, String csvSettings1) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings1));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings1) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
    }

    private Boolean stringify;
    private Boolean includeTheme2;

    public void setTojson(Boolean stringify, Boolean includeTheme2) {
        this.stringify = stringify;
        this.includeTheme2 = includeTheme2;

        js.append(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));
            js.setLength(0);
        }
    }

    private String paperSize1;
    private Boolean landscape3;

    public void setTosvg(String paperSize1, Boolean landscape3) {
        this.paperSize1 = paperSize1;
        this.landscape3 = landscape3;

        js.append(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize1, landscape3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize1, landscape3));
            js.setLength(0);
        }
    }

    private Double width5;
    private Double height7;

    public void setTosvg(Double width5, Double height7) {
        this.width5 = width5;
        this.height7 = height7;

        js.append(String.format(Locale.US, "chart.toSvg(%f, %f);", width5, height7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%f, %f);", width5, height7));
            js.setLength(0);
        }
    }

    private Boolean asXmlNode;
    private Boolean includeTheme3;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme3) {
        this.asXmlNode = asXmlNode;
        this.includeTheme3 = includeTheme3;

        js.append(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));
            js.setLength(0);
        }
    }

    private Boolean tooltip;

    public void setTooltip(Boolean tooltip) {
        this.tooltip = tooltip;

        js.append(String.format(Locale.US, "chart.tooltip(%b);", tooltip));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%b);", tooltip));
            js.setLength(0);
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        this.top = top;

        js.append(String.format(Locale.US, "chart.top(%f);", top));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%f);", top));
            js.setLength(0);
        }
    }


    public void setTop(String top1) {
        this.top1 = top1;

        js.append(String.format(Locale.US, "chart.top(%s);", top1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%s);", top1));
            js.setLength(0);
        }
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type3 = type3;
        this.useCapture2 = useCapture2;

        js.append(String.format(Locale.US, "chart.unlisten(%s, %b);", type3, useCapture2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlisten(%s, %b);", type3, useCapture2));
            js.setLength(0);
        }
    }

    private Double width6;
    private String width7;

    public void setWidth(Double width6) {
        this.width6 = width6;

        js.append(String.format(Locale.US, "chart.width(%f);", width6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%f);", width6));
            js.setLength(0);
        }
    }


    public void setWidth(String width7) {
        this.width7 = width7;

        js.append(String.format(Locale.US, "chart.width(%s);", width7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%s);", width7));
            js.setLength(0);
        }
    }

    private String xScale;

    public void setXscale(String xScale) {
        this.xScale = xScale;

        js.append(String.format(Locale.US, "chart.xScale(%s);", xScale));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", xScale));
            js.setLength(0);
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "chart.zIndex(%f);", zIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zIndex(%f);", zIndex));
            js.setLength(0);
        }
    }

    private Fill zoomMarqueeFill;

    public void setZoommarqueefill(Fill zoomMarqueeFill) {
        this.zoomMarqueeFill = zoomMarqueeFill;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s);", (zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s);", (zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color4;
    private Double opacity3;

    public void setZoommarqueefill(String color4, Double opacity3) {
        this.color4 = color4;
        this.opacity3 = opacity3;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %f);", color4, opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %f);", color4, opacity3));
            js.setLength(0);
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode3;
    private VectorRect mode4;
    private Double opacity4;

    public void setZoommarqueefill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode3 = mode3;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %b, %f, %f);", arrayToString(keys4), mode3, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %b, %f, %f);", arrayToString(keys4), mode3, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setZoommarqueefill(GradientKey[] keys4, VectorRect mode4, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %s, %f, %f);", arrayToString(keys4), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %s, %f, %f);", arrayToString(keys4), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setZoommarqueefill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode3 = mode3;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode3, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode3, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setZoommarqueefill(String[] keys5, VectorRect mode4, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode5;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setZoommarqueefill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys6 = keys6;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode5 = mode5;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }


    public void setZoommarqueefill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys7 = keys7;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode5 = mode5;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }

    private Fill imageSettings1;
    private Stroke color5;
    private ColoredFill color6;
    private String color7;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setZoommarqueestroke(Stroke color5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color5 = color5;
        this.thickness1 = thickness1;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setZoommarqueestroke(ColoredFill color6, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color6 = color6;
        this.thickness1 = thickness1;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color6 != null) ? color6.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color6 != null) ? color6.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setZoommarqueestroke(String color7, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color7 = color7;
        this.thickness1 = thickness1;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.zoomMarqueeStroke(%s, %f, %s, %s, %s);", color7, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomMarqueeStroke(%s, %f, %s, %s, %s);", color7, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


}