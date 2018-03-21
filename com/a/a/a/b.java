package com.a.a.a;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class b {
    static final Type[] a = new Type[0];

    static /* synthetic */ int a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    static /* synthetic */ void e(Type type) {
        boolean z = ((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true;
        i.a(z);
    }

    private b() {
    }

    private static GenericArrayType f(Type type) {
        return new x(type);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new x(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new x(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Class b(Type type) {
        Object obj = type;
        while (!(obj instanceof Class)) {
            if (obj instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) obj).getRawType();
                i.a(rawType instanceof Class);
                return (Class) rawType;
            } else if (obj instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) obj).getGenericComponentType()), 0).getClass();
            } else {
                if (obj instanceof TypeVariable) {
                    return Object.class;
                }
                if (obj instanceof WildcardType) {
                    obj = ((WildcardType) obj).getUpperBounds()[0];
                } else {
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + obj + "> is of type " + (obj == null ? "null" : obj.getClass().getName()));
                }
            }
        }
        return (Class) obj;
    }

    public static boolean a(Type type, Type type2) {
        Object obj = type2;
        Object obj2 = type;
        while (obj2 != obj) {
            if (obj2 instanceof Class) {
                return obj2.equals(obj);
            }
            if (obj2 instanceof ParameterizedType) {
                if (!(obj instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) obj2;
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                Object obj3 = (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) ? 1 : null;
                return obj3 != null && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            } else if (obj2 instanceof GenericArrayType) {
                if (!(obj instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) obj;
                obj2 = ((GenericArrayType) obj2).getGenericComponentType();
                obj = genericArrayType.getGenericComponentType();
            } else if (obj2 instanceof WildcardType) {
                if (!(obj instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) obj2;
                WildcardType wildcardType2 = (WildcardType) obj;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            } else if (!(obj2 instanceof TypeVariable)) {
                return false;
            } else {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj2;
                TypeVariable typeVariable2 = (TypeVariable) obj;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type a(Type type, Class cls, Class cls2) {
        Class cls3 = cls2;
        Class cls4 = cls;
        Type type2 = type;
        while (cls3 != cls4) {
            if (cls3.isInterface()) {
                Class[] interfaces = cls4.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    if (interfaces[i] == cls3) {
                        return cls4.getGenericInterfaces()[i];
                    }
                    if (cls3.isAssignableFrom(interfaces[i])) {
                        type = cls4.getGenericInterfaces()[i];
                        cls4 = interfaces[i];
                        type2 = type;
                        break;
                    }
                }
            }
            if (!cls4.isInterface()) {
                while (cls4 != Object.class) {
                    Class superclass = cls4.getSuperclass();
                    if (superclass == cls3) {
                        return cls4.getGenericSuperclass();
                    }
                    if (cls3.isAssignableFrom(superclass)) {
                        type = cls4.getGenericSuperclass();
                        cls4 = superclass;
                        type2 = type;
                    } else {
                        cls4 = superclass;
                    }
                }
            }
            return cls3;
        }
        return type2;
    }

    private static Type b(Type type, Class cls, Class cls2) {
        i.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type a(Type type, Class cls) {
        Type b = b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] b(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type a(Type type, Class cls, Type type2) {
        int i = 0;
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            Type type4 = (TypeVariable) type3;
            GenericDeclaration genericDeclaration = type4.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 != null) {
                type3 = a(type, cls, cls2);
                if (type3 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    for (int i2 = 0; i2 < typeParameters.length; i2++) {
                        if (type4.equals(typeParameters[i2])) {
                            type3 = ((ParameterizedType) type3).getActualTypeArguments()[i2];
                            continue;
                            if (type3 == type4) {
                                return type3;
                            }
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = type4;
            continue;
            if (type3 == type4) {
                return type3;
            }
        }
        Type a;
        if ((type3 instanceof Class) && ((Class) type3).isArray()) {
            Class cls3 = (Class) type3;
            type4 = cls3.getComponentType();
            a = a(type, cls, type4);
            if (type4 != a) {
                return f(a);
            }
            return cls3;
        } else if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            type4 = genericArrayType.getGenericComponentType();
            a = a(type, cls, type4);
            if (type4 != a) {
                return f(a);
            }
            return genericArrayType;
        } else if (type3 instanceof ParameterizedType) {
            int i3;
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            type4 = parameterizedType.getOwnerType();
            Type a2 = a(type, cls, type4);
            if (a2 != type4) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            r2 = parameterizedType.getActualTypeArguments();
            int length = r2.length;
            while (i < length) {
                Type a3 = a(type, cls, r2[i]);
                if (a3 != r2[i]) {
                    if (i3 == 0) {
                        r2 = (Type[]) r2.clone();
                        i3 = 1;
                    }
                    r2[i] = a3;
                }
                i++;
            }
            if (i3 != 0) {
                return new d(a2, parameterizedType.getRawType(), r2);
            }
            return parameterizedType;
        } else if (!(type3 instanceof WildcardType)) {
            return type3;
        } else {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            r2 = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                if (a(type, cls, lowerBounds[0]) == lowerBounds[0]) {
                    return wildcardType;
                }
                return new e(new Type[]{Object.class}, new Type[]{a(type, cls, lowerBounds[0])});
            } else if (r2.length != 1 || a(type, cls, r2[0]) == r2[0]) {
                return wildcardType;
            } else {
                return new e(new Type[]{a(type, cls, r2[0])}, a);
            }
        }
    }
}
