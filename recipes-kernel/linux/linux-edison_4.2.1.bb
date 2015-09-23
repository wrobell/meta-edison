LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

COMPATIBLE_MACHINE = "(edison)"

LINUX_VERSION = "4.2.1"
LINUX_VERSION_EXTENSION = ".0"
S = "${WORKDIR}/linux-${LINUX_VERSION}"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${LINUX_VERSION}.tar.xz"
SRC_URI += "file://defconfig"
SRC_URI[md5sum] = "2a538d1dac3f5426c7a8ab8ef20e95c2"
SRC_URI[sha256sum] = "7fdf35bf364cc88a9797dac0bc6c0f9951ae031c1d937f61583a649887bb8dac"
