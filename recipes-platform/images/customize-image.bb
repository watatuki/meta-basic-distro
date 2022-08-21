SUMMARY = "Coustomize image."

LICENSE = "MIT"

inherit core-image

IMAGE_LINGUAS = "ja-jp en-us"

#IMAGE_FEATURES:append = " read-only-rootfs"

# for kernel
IMAGE_INSTALL:append = "\
    kernel-modules \
    "

# for user land
IMAGE_INSTALL:append = " \
    weston weston-init \
    systemd-netif-config \
    libmnl \
    \
    qtbase \
    qtdeclarative \
    qtquickcontrols2 \
    qttranslations-qtbase \
    qttranslations-qtdeclarative \
    qttranslations-qtquickcontrols2 \
    qtquick3d \
    qtwayland \
    \
    qtwayland-examples qtquick3d-examples \
    "

# for debug
IMAGE_FEATURES:append = " ssh-server-openssh"

IMAGE_INSTALL:append= " \
    nano \
    "
IMAGE_ROOTFS_SIZE ?= "4194304"
