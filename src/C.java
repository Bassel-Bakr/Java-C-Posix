
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.HashMap;
import libcore.io.StructAddrinfo;
import libcore.io.StructFlock;
import libcore.io.StructGroupReq;
import libcore.io.StructLinger;
import libcore.io.StructPasswd;
import libcore.io.StructPollfd;
import libcore.io.StructStat;
import libcore.io.StructStatVfs;
import libcore.io.StructTimeval;
import libcore.io.StructUcred;
import libcore.io.StructUtsname;
import libcore.util.MutableInt;
import libcore.util.MutableLong;

public class C {

	public static FileDescriptor accept(FileDescriptor a, InetSocketAddress b) {
		return (FileDescriptor) invoke(Thread.currentThread().
																	 getStackTrace()[2].
																	 getMethodName(),
																	 a, b);
	}

	public static boolean access(String a, int b) {
		return (boolean) invoke(Thread.currentThread().
														getStackTrace()[2].
														getMethodName(),
														a, b);
	}

	public static void bind(FileDescriptor a, InetAddress b, int c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void chmod(String a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static void chown(String a, int b, int c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void close(FileDescriptor a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void connect(FileDescriptor a, InetAddress b, int c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static FileDescriptor dup(FileDescriptor a) {
		return (FileDescriptor) invoke(Thread.currentThread().
																	 getStackTrace()[2].
																	 getMethodName(),
																	 a);
	}

	public static FileDescriptor dup2(FileDescriptor a, int b) {
		return (FileDescriptor) invoke(Thread.currentThread().
																	 getStackTrace()[2].
																	 getMethodName(),
																	 a, b);
	}

	public static String[] environ() {
		return (String[]) invoke(Thread.currentThread().
														 getStackTrace()[2].
														 getMethodName());
	}

	public static void execv(String a, String[] b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static void execve(String a, String[] b, String[] c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void fchmod(FileDescriptor a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static void fchown(FileDescriptor a, int b, int c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}


	public static int fcntlFlock(FileDescriptor a, int b, StructFlock c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}


	public static int fcntlLong(FileDescriptor a, int b, long c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}

	public static int fcntlVoid(FileDescriptor a, int b) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b);
	}

	public static void fdatasync(FileDescriptor a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}


	public static StructStat fstat(FileDescriptor a) {
		return (StructStat) invoke(Thread.currentThread().
															 getStackTrace()[2].
															 getMethodName(),
															 a);
	}

	public static StructStatVfs fstatvfs(FileDescriptor a) {
		return (StructStatVfs) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName(),
																	a);
	}


	public static void fsync(FileDescriptor a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void ftruncate(FileDescriptor a, long b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static String gai_strerror(int a) {
		return (String) invoke(Thread.currentThread().
													 getStackTrace()[2].
													 getMethodName(),
													 a);
	}


	public static InetAddress[] getaddrinfo(String a, StructAddrinfo b) {
		return (InetAddress[]) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName(),
																	a, b);
	}


	public static int getegid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());
	}
	public static String getenv(String a) {
		return (String) invoke(Thread.currentThread().
													 getStackTrace()[2].
													 getMethodName(),
													 a);
	}

	public static int geteuid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());
	}

	public static int getgid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());
	}

	public static String getnameinfo(InetAddress a, int b) {
		return (String) invoke(Thread.currentThread().
													 getStackTrace()[2].
													 getMethodName(),
													 a, b);
	}

	public static SocketAddress getpeername(FileDescriptor a) {
		return (SocketAddress) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName(),
																	a);
	}

	public static int getpid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());
	}
	public static int getppid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());}

	public static StructPasswd getpwnam(String a) {
		return (StructPasswd) invoke(Thread.currentThread().
																 getStackTrace()[2].
																 getMethodName(),
																 a);
	}

	public static StructPasswd getpwuid(int a) {
		return (StructPasswd) invoke(Thread.currentThread().
																 getStackTrace()[2].
																 getMethodName(),
																 a);
	}


	public static SocketAddress getsockname(FileDescriptor a) {
		return (SocketAddress) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName(),
																	a);
	}

	public static int getsockoptByte(FileDescriptor a, int b, int c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}

	public static InetAddress getsockoptInAddr(FileDescriptor a, int b, int c) {
		return (InetAddress) invoke(Thread.currentThread().
																getStackTrace()[2].
																getMethodName(),
																a, b, c);
	}

	public static int getsockoptInt(FileDescriptor a, int b, int c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}


	public static StructLinger getsockoptLinger(FileDescriptor a, int b, int c) {
		return (StructLinger) invoke(Thread.currentThread().
																 getStackTrace()[2].
																 getMethodName(),
																 a, b, c);
	}

	public static StructTimeval getsockoptTimeval(FileDescriptor a, int b, int c) {
		return (StructTimeval) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName(),
																	a, b, c);
	}

	public static StructUcred getsockoptUcred(FileDescriptor a, int b, int c) {
		return (StructUcred) invoke(Thread.currentThread().
																getStackTrace()[2].
																getMethodName(),
																a, b, c);
	}


	public static int gettid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());
	}

	public static int getuid() {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName());
	}

	public static String if_indextoname(int a) {
		return (String) invoke(Thread.currentThread().
													 getStackTrace()[2].
													 getMethodName(),
													 a);
	}

	public static InetAddress inet_pton(int a, String b) {
		return (InetAddress) invoke(Thread.currentThread().
																getStackTrace()[2].
																getMethodName(),
																a, b);
	}

	public static InetAddress ioctlInetAddress(FileDescriptor a, int b, String c) {
		return (InetAddress) invoke(Thread.currentThread().
																getStackTrace()[2].
																getMethodName(),
																a, b, c);
	}


	public static int ioctlInt(FileDescriptor a, int b, MutableInt c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}


	public static boolean isatty(FileDescriptor a) {
		return (boolean) invoke(Thread.currentThread().
														getStackTrace()[2].
														getMethodName(),
														a);
	}

	public static void kill(int a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static void lchown(String a, int b, int c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void listen(FileDescriptor a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static long lseek(FileDescriptor a, long b, int c) {
		return (long) invoke(Thread.currentThread().
												 getStackTrace()[2].
												 getMethodName(),
												 a, b, c);
	}


	public static StructStat lstat(String a) {
		return (StructStat) invoke(Thread.currentThread().
															 getStackTrace()[2].
															 getMethodName(),
															 a);
	}


	public static void mincore(long a, long b, byte[] c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void mkdir(String a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static void mlock(long a, long b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static long mmap(long a, long b, int c, int d, FileDescriptor e, long f) {
		return (long) invoke(Thread.currentThread().
												 getStackTrace()[2].
												 getMethodName(),
												 a, b, c, d, e, f);
	}

	public static void msync(long a, long b, int c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void munlock(long a, long b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static void munmap(long a, long b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static FileDescriptor open(String a, int b, int c) {
		return (FileDescriptor) invoke(Thread.currentThread().
																	 getStackTrace()[2].
																	 getMethodName(),
																	 a, b, c);
	}

	public static FileDescriptor[] pipe() {
		return (FileDescriptor[]) invoke(Thread.currentThread().
																		 getStackTrace()[2].
																		 getMethodName());
	}

	public static int poll(StructPollfd[] a, int b) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b);
	}


	public static int pread(FileDescriptor a, ByteBuffer b, long c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}

	public static int pread(FileDescriptor a, byte[] b, int c, int d, long e) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e);
	}

	public static int pwrite(FileDescriptor a, ByteBuffer b, long c) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c);
	}

	public static int pwrite(FileDescriptor a, byte[] b, int c, int d, long e) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e);
	}

	public static int read(FileDescriptor a, ByteBuffer b) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b);
	}

	public static int read(FileDescriptor a, byte[] b, int c, int d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}

	public static int readv(FileDescriptor a, Object[] b, int[] c, int[] d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}

	public static int recvfrom(FileDescriptor a, ByteBuffer b, int c, InetSocketAddress d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}

	public static int recvfrom(FileDescriptor a, byte[] b, int c, int d, int e, InetSocketAddress f) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e, f);
	}

	public static void remove(String a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void rename(String a, String b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}


	public static long sendfile(FileDescriptor a, FileDescriptor b, MutableLong c, long d) {
		return (long) invoke(Thread.currentThread().
												 getStackTrace()[2].
												 getMethodName(),
												 a, b, c, d);
	}


	public static int sendto(FileDescriptor a, ByteBuffer b, int c, InetAddress d, int e) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e);
	}

	public static int sendto(FileDescriptor a, byte[] b, int c, int d, int e, InetAddress f, int g) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e, f, g);
	}

	public static void setegid(int a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void setenv(String a, String b, boolean c) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c);
	}

	public static void seteuid(int a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void setgid(int a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static int setsid() {
		return invoke(Thread.currentThread().
									getStackTrace()[2].
									getMethodName());
	}

	public static void setsockoptByte(FileDescriptor a, int b, int c, int d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}


	public static void setsockoptGroupReq(FileDescriptor a, int b, int c, StructGroupReq d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}


	public static void setsockoptIfreq(FileDescriptor a, int b, int c, String d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}

	public static void setsockoptInt(FileDescriptor a, int b, int c, int d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}

	public static void setsockoptIpMreqn(FileDescriptor a, int b, int c, int d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}


	public static void setsockoptLinger(FileDescriptor a, int b, int c, StructLinger d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}

	public static void setsockoptTimeval(FileDescriptor a, int b, int c, StructTimeval d) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d);
	}


	public static void setuid(int a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void shutdown(FileDescriptor a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static FileDescriptor socket(int a, int b, int c) {
		return (FileDescriptor) invoke(Thread.currentThread().
																	 getStackTrace()[2].
																	 getMethodName(),
																	 a, b, c);
	}

	public static void socketpair(int a, int b, int c, FileDescriptor d, FileDescriptor e) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b, c, d, e);
	}


	public static StructStat stat(String a) {
		return (StructStat) invoke(Thread.currentThread().
															 getStackTrace()[2].
															 getMethodName(),
															 a);
	}

	public static StructStatVfs statvfs(String a) {
		return (StructStatVfs) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName(),
																	a);
	}


	public static String strerror(int a) {
		return (String) invoke(Thread.currentThread().
													 getStackTrace()[2].
													 getMethodName(),
													 a);
	}

	public static String strsignal(int a) {
		return (String) invoke(Thread.currentThread().
													 getStackTrace()[2].
													 getMethodName(),
													 a);
	}

	public static void symlink(String a, String b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static long sysconf(int a) {
		return (long) invoke(Thread.currentThread().
												 getStackTrace()[2].
												 getMethodName(),
												 a);
	}

	public static void tcdrain(FileDescriptor a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static void tcsendbreak(FileDescriptor a, int b) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a, b);
	}

	public static int umask(int a) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a);
	}

	public static void unsetenv(String a) {
		invoke(Thread.currentThread().
					 getStackTrace()[2].
					 getMethodName(),
					 a);
	}

	public static StructUtsname uname() {
		return (StructUtsname) invoke(Thread.currentThread().
																	getStackTrace()[2].
																	getMethodName());
	}

	/* public static int waitpid(int a, MutableInt b, int c) {
	 return (int) invoke(Thread.currentThread().
	 getStackTrace()[2].
	 getMethodName(),
	 a, b, c);
	 }*/

	public static int write(FileDescriptor a, ByteBuffer b) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b);
	}

	public static int write(FileDescriptor a, byte[] b, int c, int d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}

	public static int writev(FileDescriptor a, Object[] b, int[] c, int[] d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}

	public static int preadBytes(FileDescriptor a, Object b, int c, int d, long e) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e);
	}

	public static int pwriteBytes(FileDescriptor a, Object b, int c, int d, long e) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e);
	}

	public static int readBytes(FileDescriptor a, Object b, int c, int d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}

	public static int recvfromBytes(FileDescriptor a, Object b, int c, int d, int e, InetSocketAddress f) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e, f);
	}

	public static int sendtoBytes(FileDescriptor a, Object b, int c, int d, int e, InetAddress f, int g) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d, e, f, g);
	}

	public static int umaskImpl(int a) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a);
	}

	public static int writeBytes(FileDescriptor a, Object b, int c, int d) {
		return (int) invoke(Thread.currentThread().
												getStackTrace()[2].
												getMethodName(),
												a, b, c, d);
	}


	private static <T> T invoke(String func, Object... args) {
		try {
			return (T) map.get(func).
				invoke(
				os_instance, 
				args);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
			return null;
		}
	}

	static {
		try {
			Class<?> osc = Class.forName("libcore.io.OsConstants");
			Class<?> this_class = C.class;
			Field[] constant_fields = osc.getDeclaredFields();
			for (Field f : constant_fields) {
				f.setAccessible(true);
				this_class.
					getDeclaredField(
					f.getName()).
					set(null, f.get(null));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		map = new HashMap<String, Method>();
		try {
			Class<?> osc = Class.forName("libcore.io.Os");
			os_instance = Class
				.forName("libcore.io.Libcore")
				.getDeclaredField("os")
				.get(null);
			Method[] osc_functions = osc.getDeclaredMethods();
			for (Method m : osc_functions) {
				m.setAccessible(true);
				map.put(m.getName(), m);
			}
		} catch (Exception e) {

		}
	}

	private static HashMap<String, Method> map;
	private static Object os_instance;

	public static int AF_INET,
	AF_INET6,
	AF_UNIX,
	AF_UNSPEC,
	AI_ADDRCONFIG,
	AI_ALL,
	AI_CANONNAME,
	AI_NUMERICHOST,
	AI_NUMERICSERV,
	AI_PASSIVE,
	AI_V4MAPPED,
	CAP_AUDIT_CONTROL,
	CAP_AUDIT_WRITE,
	CAP_BLOCK_SUSPEND,
	CAP_CHOWN,
	CAP_DAC_OVERRIDE,
	CAP_DAC_READ_SEARCH,
	CAP_FOWNER,
	CAP_FSETID,
	CAP_IPC_LOCK,
	CAP_IPC_OWNER,
	CAP_KILL,
	CAP_LAST_CAP,
	CAP_LEASE,
	CAP_LINUX_IMMUTABLE,
	CAP_MAC_ADMIN,
	CAP_MAC_OVERRIDE,
	CAP_MKNOD,
	CAP_NET_ADMIN,
	CAP_NET_BIND_SERVICE,
	CAP_NET_BROADCAST,
	CAP_NET_RAW,
	CAP_SETFCAP,
	CAP_SETGID,
	CAP_SETPCAP,
	CAP_SETUID,
	CAP_SYSLOG,
	CAP_SYS_ADMIN,
	CAP_SYS_BOOT,
	CAP_SYS_CHROOT,
	CAP_SYS_MODULE,
	CAP_SYS_NICE,
	CAP_SYS_PACCT,
	CAP_SYS_PTRACE,
	CAP_SYS_RAWIO,
	CAP_SYS_RESOURCE,
	CAP_SYS_TIME,
	CAP_SYS_TTY_CONFIG,
	CAP_WAKE_ALARM,
	E2BIG,
	EACCES,
	EADDRINUSE,
	EADDRNOTAVAIL,
	EAFNOSUPPORT,
	EAGAIN,
	EAI_AGAIN,
	EAI_BADFLAGS,
	EAI_FAIL,
	EAI_FAMILY,
	EAI_MEMORY,
	EAI_NODATA,
	EAI_NONAME,
	EAI_OVERFLOW,
	EAI_SERVICE,
	EAI_SOCKTYPE,
	EAI_SYSTEM,
	EALREADY,
	EBADF,
	EBADMSG,
	EBUSY,
	ECANCELED,
	ECHILD,
	ECONNABORTED,
	ECONNREFUSED,
	ECONNRESET,
	EDEADLK,
	EDESTADDRREQ,
	EDOM,
	EDQUOT,
	EEXIST,
	EFAULT,
	EFBIG,
	EHOSTUNREACH,
	EIDRM,
	EILSEQ,
	EINPROGRESS,
	EINTR,
	EINVAL,
	EIO,
	EISCONN,
	EISDIR,
	ELOOP,
	EMFILE,
	EMLINK,
	EMSGSIZE,
	EMULTIHOP,
	ENAMETOOLONG,
	ENETDOWN,
	ENETRESET,
	ENETUNREACH,
	ENFILE,
	ENOBUFS,
	ENODATA,
	ENODEV,
	ENOENT,
	ENOEXEC,
	ENOLCK,
	ENOLINK,
	ENOMEM,
	ENOMSG,
	ENOPROTOOPT,
	ENOSPC,
	ENOSR,
	ENOSTR,
	ENOSYS,
	ENOTCONN,
	ENOTDIR,
	ENOTEMPTY,
	ENOTSOCK,
	ENOTSUP,
	ENOTTY,
	ENXIO,
	EOPNOTSUPP,
	EOVERFLOW,
	EPERM,
	EPIPE,
	EPROTO,
	EPROTONOSUPPORT,
	EPROTOTYPE,
	ERANGE,
	EROFS,
	ESPIPE,
	ESRCH,
	ESTALE,
	ETIME,
	ETIMEDOUT,
	ETXTBSY,
	EXDEV,
	EXIT_FAILURE,
	EXIT_SUCCESS,
	FD_CLOEXEC,
	FIONREAD,
	F_DUPFD,
	F_GETFD,
	F_GETFL,
	F_GETLK,
	F_GETLK64,
	F_GETOWN,
	F_OK,
	F_RDLCK,
	F_SETFD,
	F_SETFL,
	F_SETLK,
	F_SETLK64,
	F_SETLKW,
	F_SETLKW64,
	F_SETOWN,
	F_UNLCK,
	F_WRLCK,
	IFF_ALLMULTI,
	IFF_AUTOMEDIA,
	IFF_BROADCAST,
	IFF_DEBUG,
	IFF_DYNAMIC,
	IFF_LOOPBACK,
	IFF_MASTER,
	IFF_MULTICAST,
	IFF_NOARP,
	IFF_NOTRAILERS,
	IFF_POINTOPOINT,
	IFF_PORTSEL,
	IFF_PROMISC,
	IFF_RUNNING,
	IFF_SLAVE,
	IFF_UP,
	IPPROTO_ICMP,
	IPPROTO_ICMPV6,
	IPPROTO_IP,
	IPPROTO_IPV6,
	IPPROTO_RAW,
	IPPROTO_TCP,
	IPPROTO_UDP,
	IPV6_CHECKSUM,
	IPV6_MULTICAST_HOPS,
	IPV6_MULTICAST_IF,
	IPV6_MULTICAST_LOOP,
	IPV6_RECVDSTOPTS,
	IPV6_RECVHOPLIMIT,
	IPV6_RECVHOPOPTS,
	IPV6_RECVPKTINFO,
	IPV6_RECVRTHDR,
	IPV6_RECVTCLASS,
	IPV6_TCLASS,
	IPV6_UNICAST_HOPS,
	IPV6_V6ONLY,
	IP_MULTICAST_IF,
	IP_MULTICAST_LOOP,
	IP_MULTICAST_TTL,
	IP_TOS,
	IP_TTL,
	MAP_FIXED,
	MAP_PRIVATE,
	MAP_SHARED,
	MCAST_JOIN_GROUP,
	MCAST_LEAVE_GROUP,
	MCL_CURRENT,
	MCL_FUTURE,
	MSG_CTRUNC,
	MSG_DONTROUTE,
	MSG_EOR,
	MSG_OOB,
	MSG_PEEK,
	MSG_TRUNC,
	MSG_WAITALL,
	MS_ASYNC,
	MS_INVALIDATE,
	MS_SYNC,
	NI_DGRAM,
	NI_NAMEREQD,
	NI_NOFQDN,
	NI_NUMERICHOST,
	NI_NUMERICSERV,
	O_ACCMODE,
	O_APPEND,
	O_CREAT,
	O_EXCL,
	O_NOCTTY,
	O_NOFOLLOW,
	O_NONBLOCK,
	O_RDONLY,
	O_RDWR,
	O_SYNC,
	O_TRUNC,
	O_WRONLY,
	POLLERR,
	POLLHUP,
	POLLIN,
	POLLNVAL,
	POLLOUT,
	POLLPRI,
	POLLRDBAND,
	POLLRDNORM,
	POLLWRBAND,
	POLLWRNORM,
	PROT_EXEC,
	PROT_NONE,
	PROT_READ,
	PROT_WRITE,
	R_OK,
	SEEK_CUR,
	SEEK_END,
	SEEK_SET,
	SHUT_RD,
	SHUT_RDWR,
	SHUT_WR,
	SIGABRT,
	SIGALRM,
	SIGBUS,
	SIGCHLD,
	SIGCONT,
	SIGFPE,
	SIGHUP,
	SIGILL,
	SIGINT,
	SIGIO,
	SIGKILL,
	SIGPIPE,
	SIGPROF,
	SIGPWR,
	SIGQUIT,
	SIGRTMAX,
	SIGRTMIN,
	SIGSEGV,
	SIGSTKFLT,
	SIGSTOP,
	SIGSYS,
	SIGTERM,
	SIGTRAP,
	SIGTSTP,
	SIGTTIN,
	SIGTTOU,
	SIGURG,
	SIGUSR1,
	SIGUSR2,
	SIGVTALRM,
	SIGWINCH,
	SIGXCPU,
	SIGXFSZ,
	SIOCGIFADDR,
	SIOCGIFBRDADDR,
	SIOCGIFDSTADDR,
	SIOCGIFNETMASK,
	SOCK_DGRAM,
	SOCK_RAW,
	SOCK_SEQPACKET,
	SOCK_STREAM,
	SOL_SOCKET,
	SO_BINDTODEVICE,
	SO_BROADCAST,
	SO_DEBUG,
	SO_DONTROUTE,
	SO_ERROR,
	SO_KEEPALIVE,
	SO_LINGER,
	SO_OOBINLINE,
	SO_PASSCRED,
	SO_PEERCRED,
	SO_RCVBUF,
	SO_RCVLOWAT,
	SO_RCVTIMEO,
	SO_REUSEADDR,
	SO_SNDBUF,
	SO_SNDLOWAT,
	SO_SNDTIMEO,
	SO_TYPE,
	STDERR_FILENO,
	STDIN_FILENO,
	STDOUT_FILENO,
	S_IFBLK,
	S_IFCHR,
	S_IFDIR,
	S_IFIFO,
	S_IFLNK,
	S_IFMT,
	S_IFREG,
	S_IFSOCK,
	S_IRGRP,
	S_IROTH,
	S_IRUSR,
	S_IRWXG,
	S_IRWXO,
	S_IRWXU,
	S_ISGID,
	S_ISUID,
	S_ISVTX,
	S_IWGRP,
	S_IWOTH,
	S_IWUSR,
	S_IXGRP,
	S_IXOTH,
	S_IXUSR,
	TCP_NODELAY,
	WCONTINUED,
	WEXITED,
	WNOHANG,
	WNOWAIT,
	WSTOPPED,
	WUNTRACED,
	W_OK,
	X_OK,
	_SC_2_CHAR_TERM,
	_SC_2_C_BIND,
	_SC_2_C_DEV,
	_SC_2_C_VERSION,
	_SC_2_FORT_DEV,
	_SC_2_FORT_RUN,
	_SC_2_LOCALEDEF,
	_SC_2_SW_DEV,
	_SC_2_UPE,
	_SC_2_VERSION,
	_SC_AIO_LISTIO_MAX,
	_SC_AIO_MAX,
	_SC_AIO_PRIO_DELTA_MAX,
	_SC_ARG_MAX,
	_SC_ASYNCHRONOUS_IO,
	_SC_ATEXIT_MAX,
	_SC_AVPHYS_PAGES,
	_SC_BC_BASE_MAX,
	_SC_BC_DIM_MAX,
	_SC_BC_SCALE_MAX,
	_SC_BC_STRING_MAX,
	_SC_CHILD_MAX,
	_SC_CLK_TCK,
	_SC_COLL_WEIGHTS_MAX,
	_SC_DELAYTIMER_MAX,
	_SC_EXPR_NEST_MAX,
	_SC_FSYNC,
	_SC_GETGR_R_SIZE_MAX,
	_SC_GETPW_R_SIZE_MAX,
	_SC_IOV_MAX,
	_SC_JOB_CONTROL,
	_SC_LINE_MAX,
	_SC_LOGIN_NAME_MAX,
	_SC_MAPPED_FILES,
	_SC_MEMLOCK,
	_SC_MEMLOCK_RANGE,
	_SC_MEMORY_PROTECTION,
	_SC_MESSAGE_PASSING,
	_SC_MQ_OPEN_MAX,
	_SC_MQ_PRIO_MAX,
	_SC_NGROUPS_MAX,
	_SC_NPROCESSORS_CONF,
	_SC_NPROCESSORS_ONLN,
	_SC_OPEN_MAX,
	_SC_PAGESIZE,
	_SC_PAGE_SIZE,
	_SC_PASS_MAX,
	_SC_PHYS_PAGES,
	_SC_PRIORITIZED_IO,
	_SC_PRIORITY_SCHEDULING,
	_SC_REALTIME_SIGNALS,
	_SC_RE_DUP_MAX,
	_SC_RTSIG_MAX,
	_SC_SAVED_IDS,
	_SC_SEMAPHORES,
	_SC_SEM_NSEMS_MAX,
	_SC_SEM_VALUE_MAX,
	_SC_SHARED_MEMORY_OBJECTS,
	_SC_SIGQUEUE_MAX,
	_SC_STREAM_MAX,
	_SC_SYNCHRONIZED_IO,
	_SC_THREADS,
	_SC_THREAD_ATTR_STACKADDR,
	_SC_THREAD_ATTR_STACKSIZE,
	_SC_THREAD_DESTRUCTOR_ITERATIONS,
	_SC_THREAD_KEYS_MAX,
	_SC_THREAD_PRIORITY_SCHEDULING,
	_SC_THREAD_PRIO_INHERIT,
	_SC_THREAD_PRIO_PROTECT,
	_SC_THREAD_SAFE_FUNCTIONS,
	_SC_THREAD_STACK_MIN,
	_SC_THREAD_THREADS_MAX,
	_SC_TIMERS,
	_SC_TIMER_MAX,
	_SC_TTY_NAME_MAX,
	_SC_TZNAME_MAX,
	_SC_VERSION,
	_SC_XBS5_ILP32_OFF32,
	_SC_XBS5_ILP32_OFFBIG,
	_SC_XBS5_LP64_OFF64,
	_SC_XBS5_LPBIG_OFFBIG,
	_SC_XOPEN_CRYPT,
	_SC_XOPEN_ENH_I18N,
	_SC_XOPEN_LEGACY,
	_SC_XOPEN_REALTIME,
	_SC_XOPEN_REALTIME_THREADS,
	_SC_XOPEN_SHM,
	_SC_XOPEN_UNIX,
	_SC_XOPEN_VERSION,
	_SC_XOPEN_XCU_VERSION;
}
